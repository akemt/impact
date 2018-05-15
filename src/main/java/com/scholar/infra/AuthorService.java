package com.scholar.infra;

import com.github.pagehelper.Page;
import com.scholar.entity.CoreAuthor;
import com.scholar.entity.ImpactLindexDetail;

import java.util.List;
import java.util.Map;

public interface AuthorService {

    /**
     * 根据aid ,查询图形信息
     *
     * @param aid
     * @return
     */
    List<Map<String, Object>> getGraphImpactbyAid(Integer aid);


    /**
     * 获取作者的文章列表
     *
     * @param aid
     * @return
     */
    Map<String, Object> getAuthorImpactList(Integer aid,String orderby, Integer page, Integer size);


    /**
     * 获取个人信息
     *
     * @param aid
     * @return
     */
    CoreAuthor getAuthorInfo(String aid);

    /**
     * statistics最下面的表格
     *
     * @param aid
     * @return
     */
    Map<String, Object> getAuthorJifsList(String aid, String orderby, Integer page, Integer size);

    /**
     * 作者每年的文献published图
     *
     * @param aid
     * @return
     */
    List<Map<String, Object>> getAuthorGraphPublishedByYear(String aid);

    /**
     * 作者每年的文献h-index图
     *
     * @param aid
     * @return
     */
    Map<String, Object> getAuthorGraphhindexByYear(String aid);

    /**
     * 作者每年的文献proportions图
     *
     * @param aid
     * @return
     */
    List<Map<String, Object>> getAuthorGraphProportions(String aid);

    /**
     * 作者每年的文献jif图
     *
     * @param aid
     * @return
     */
    List<Map<String, Object>> getAuthorGraphJif(String aid);

    /**
     * impact中affilications图
     *
     * @param aid
     * @return
     */
    Map<String, Object> getAuthorPapersCiteAffil(String aid, String orderby, Integer page, Integer size);

    /**
     * 被引用的组织impact中affilications图-前10和othoer
     *
     * @param aid
     * @return
     */
    List<Map<String, Object>> getAuthorGraphImpactAffil(String aid);

    /**
     * impact中affilications图
     *
     * @param aid
     * @return
     */
    Map<String, Object> getAuthorPapersCiteCountry(String aid, String orderby, Integer page, Integer size);

    /**
     * 被引用的国家impact中country图-前10和othoer
     *
     * @param aid
     * @return
     */
    List<Map<String, Object>> getAuthorGraphImpactCountry(String aid);

    /**
     * 被引用的期刊impact中journal图
     * @param aid
     * @return
     */
    Map<String, Object> getAuthorPapersCiteJournal(String aid, String orderby, Integer page, Integer size);

    /**
     * 被引用的国家impact中country图-前10和othoer
     *
     * @param aid
     * @return
     */
    List<Map<String, Object>> getAuthorGraphImpactJournals(String aid);

    /**
     * 被引用的国家impact中country图-前10和othoer
     *
     * @param aid
     * @return
     */
    List<Map<String, Object>> getAuthorGraphPapers(String aid);
}
