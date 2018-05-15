package com.scholar.mapper;

import com.github.pagehelper.Page;
import com.scholar.entity.CoreAuthor;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CoreAuthorMapper {
    int deleteByPrimaryKey(String autid);

    int insert(CoreAuthor record);

    CoreAuthor selectByPrimaryKey(String autid);

    List<CoreAuthor> selectAll();

    int updateByPrimaryKey(CoreAuthor record);


    CoreAuthor selectAuthorInfoByPrimaryKey(String autid);


    Page<Map<String, Object>> getAuthorJifsList(String autid);


    List<Map<String, Object>> getAuthorGraphPublishedByYear(String aid);

    List<Map<String, Object>> getAuthorGraphhindexByYear(String aid);

    List<Map<String, Object>> getAuthorGraphProportionsTop10(String aid);

    Integer getAuthorGraphProportionsAll(String aid);

    List<Map<String, Object>> getAuthorGraphJif(String aid);

    Page<Map<String, Object>> getAuthorPapersCiteAffil(@Param("aid") String aid);

    List<Map<String, Object>> getAuthorPapersCiteAffilTop10(@Param("aid") String aid, @Param("limit") Integer limit);

    Integer getAuthorPapersCiteAffilAll(String aid);

    Page<Map<String, Object>> getAuthorPapersCiteCountry(@Param("aid") String aid);

    List<Map<String, Object>> getAuthorPapersCiteCountryTop10(@Param("aid") String aid, @Param("limit") Integer limit);

    Integer getAuthorPapersCiteCountryAll(String aid);

    Page<Map<String, Object>> getAuthorPapersCiteJournal(@Param("aid") String aid);

    List<Map<String, Object>> getAuthorPapersCiteJournalTop10(@Param("aid") String aid, @Param("limit") Integer limit);

    Map<String, Object> getAuthorPapersCiteJournalAll(String aid);


    List<Map<String, Object>> getAuthorGraphPapersYear(String aid);

    List<Map<String, Object>> getAuthorGraphPapersByAidAndYear(String aid);
}