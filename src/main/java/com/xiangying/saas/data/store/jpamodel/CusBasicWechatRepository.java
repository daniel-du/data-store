package com.xiangying.saas.data.store.jpamodel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CusBasicWechatRepository extends JpaRepository<CusBasicWechat, String>, JpaSpecificationExecutor<CusBasicWechat> {

    CusBasicWechat getByCusBasicWechatPublicid(String cusBasicWechatPublicid);

    CusBasicWechat getByCusBasicWechatUnionid(String cusBasicWechatUnionid);

    CusBasicWechat getByCusBasicWechatStepPublicid(String cusBasicWechatStepPublicid);

    CusBasicWechat findByCusBasicWechatSmailid(String cusBasicWechatSmailid);

    CusBasicWechat getByCusBasicInfoNo(String cusBasicInfoNo);

    List<CusBasicWechat> getAllByCusBasicInfoNoIn(Iterable<String> cusBasicInfoNos);


//    @Transactional
//    @Modifying
//    @Query(value = "update CusBasicWechat set cusBasicWechatPoints = cusBasicWechatPoints + :cusBasicWechatPoints where cusBasicWechatUnionid = :cusBasicWechatUnionid")
//    int updateCusBasicWechatByPrimary(@Param("cusBasicWechatPoints") Integer cusBasicWechatPoints, @Param("cusBasicWechatUnionid") String cusBasicWechatUnionid);

}