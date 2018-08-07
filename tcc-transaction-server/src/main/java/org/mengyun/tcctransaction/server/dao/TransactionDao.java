package org.mengyun.tcctransaction.server.dao;

import org.mengyun.tcctransaction.server.dto.PageDto;
import org.mengyun.tcctransaction.server.vo.TransactionVo;

import java.util.List;

/**
 * Created by changming.xie on 9/7/16.
 */
public interface TransactionDao {
    /**
     * 获得事务 VO 数组
     *
     * @param pageNum  第几页
     * @param pageSize 分页大小
     * @return 事务 VO 数组
     */
    public List<TransactionVo> findTransactions(Integer pageNum, int pageSize);

    /**
     * 获得事务总数量
     *
     * @return 数量
     */
    public Integer countOfFindTransactions();

    /**
     * 重置事务重试次数
     *
     * @param globalTxId      全局事务编号
     * @param branchQualifier 分支事务编号
     * @return 是否重置成功
     */
    public void resetRetryCount(String globalTxId, String branchQualifier);

    public void delete(String globalTxId, String branchQualifier);

    public void confirm(String globalTxId, String branchQualifier);

    public void cancel(String globalTxId, String branchQualifier);

    public String getDomain();

    public PageDto<TransactionVo> findTransactionPageDto(Integer pageNum, int pageSize);
}

