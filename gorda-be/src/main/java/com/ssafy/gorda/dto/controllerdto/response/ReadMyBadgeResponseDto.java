package com.ssafy.gorda.dto.controllerdto.response;

import com.ssafy.gorda.domain.Badge;
import com.ssafy.gorda.domain.MyBadge;
import com.ssafy.gorda.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ReadMyBadgeResponseDto {

    private String myBadgeIdx;
    private String badgeIdx;
    private String userIdx;
    private LocalDateTime myBadgeDate;
    private int isMyBadgeEmpty;
    private String myBadgeName;
    private String myBadgeContent;
    private String myBadgeLogo;

    public ReadMyBadgeResponseDto(MyBadge myBadge) {

        this.myBadgeIdx = myBadge.getMyBadgeIdx();
        this.badgeIdx = myBadge.getBadge().getBadgeIdx();
        this.userIdx = myBadge.getUser().getUserIdx();
        this.myBadgeDate = myBadge.getMyBadgeDate();
        this.isMyBadgeEmpty = myBadge.getIsMyBadgeEmpty();
        this.myBadgeContent = myBadge.getMyBadgeContent();
        this.myBadgeName = myBadge.getMyBadgeName();
        this.myBadgeLogo = myBadge.getMyBadgeLogo();
    }

}
