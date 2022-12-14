package com.ssafy.gorda.repository;

import com.ssafy.gorda.domain.Badge;
import com.ssafy.gorda.domain.MyBadge;
import com.ssafy.gorda.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;
import java.util.List;

@Repository
@RequiredArgsConstructor

public class MyBadgeRepository {

    private final EntityManager em;

    public String regist(MyBadge myBadge) {

        em.persist(myBadge);
        return "Loc : MyBadgeRepository - 뱃지 등록 완료";
    }

    // 나의 뱃지 찾기

    public MyBadge findByIdx(String Idx) {

        return em.find(MyBadge.class, Idx);
    }

    public List<MyBadge> findByUserIdx(String userIdx) {

        List<MyBadge> myBadgeList = em.createQuery("SELECT m FROM MyBadge m WHERE m.user.userIdx = :user_idx",MyBadge.class)
                .setParameter("user_idx",userIdx).getResultList();

        return myBadgeList;

    }


    //뱃지 삭제

    public String delete(MyBadge myBadge) {

        em.remove(myBadge);
        return "Loc : BadgeRepository - 나의 뱃지 삭제 완료";
    }

    public String modifyMyBadge(MyBadge mybadge) {

        mybadge.setIsMyBadgeEmpty(1);
        mybadge.setMyBadgeDate(LocalDateTime.now());
        return "Loc : BadgeRepository - 내 뱃지 획득";
    }
}
