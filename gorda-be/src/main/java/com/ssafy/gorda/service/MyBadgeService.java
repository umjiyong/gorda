package com.ssafy.gorda.service;

import com.ssafy.gorda.domain.Badge;
import com.ssafy.gorda.domain.MyBadge;
import com.ssafy.gorda.repository.BadgeRepository;
import com.ssafy.gorda.repository.MyBadgeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)

public class MyBadgeService {

    private final MyBadgeRepository myBadgeRepository;

    //등록

    @Transactional
    public String regist(MyBadge myBadge) {

        myBadgeRepository.regist(myBadge);

        return "Loc : MyBadgeService - 내 뱃지 등록완료";

    }

    //찾기

    public MyBadge findByIdx(String Idx) {

        return myBadgeRepository.findByIdx(Idx);

    }

    //유저로 찾기

    public List<MyBadge> findByUserIdx(String Idx){

        List<MyBadge> myBadgeList = myBadgeRepository.findByUserIdx(Idx);

        return myBadgeList;

    }

//업데이트
}