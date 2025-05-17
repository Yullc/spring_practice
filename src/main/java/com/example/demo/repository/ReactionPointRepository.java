package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ReactionPointRepository {
    int getLikePoint(@Param("relTypeCode") String relTypeCode, @Param("relId") int relId);
    int getDisLikePoint(@Param("relTypeCode") String relTypeCode, @Param("relId") int relId);
    int increaseLikeCount(int id);
    int increaseDisLikeCount(int id);
}

