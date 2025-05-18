package com.example.demo.service;

import com.example.demo.repository.ReactionPointRepository;
import com.example.demo.vo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReactionPointService {
    @Autowired
    private ReactionPointRepository reactionPointRepository;
    private int loginedMemberId;

    public int getLikePoint(String relTypeCode, int relId) {
        return reactionPointRepository.getLikePoint(relTypeCode, relId);
    }
    public int getDisLikePoint(String relTypeCode, int relId) {
        return reactionPointRepository.getDisLikePoint(relTypeCode, relId);
    }
    public ResultData doIncreaseLikeCount(int id,int loginedMemberId) {
        this.loginedMemberId = loginedMemberId;
        int likeCount = reactionPointRepository.increaseLikeCount(id);

        if (likeCount == 0) {
            return ResultData.from("F-1", "좋아요 안올라감", "id", id);
        }

        return ResultData.from("S-1", "좋아요 증가", "id", id);
    }

    public ResultData doIncreaseDisLikeCount(int id, int i) {
        int dislikeCount = reactionPointRepository.increaseDisLikeCount(id);

        if (dislikeCount == 0) {
            return ResultData.from("F-1", "싫어요 안올라감", "id", id);
        }

        return ResultData.from("S-1", "싫어요 증가", "id", id);
    }


}
