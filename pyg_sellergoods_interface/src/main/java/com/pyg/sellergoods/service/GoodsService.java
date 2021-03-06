package com.pyg.sellergoods.service;
import java.util.List;
import com.pyg.pojo.TbGoods;

import com.pyg.pojo.TbItem;
import com.pyg.pojogroup.Goods;
import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface GoodsService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbGoods> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Goods goods);
	
	
	/**
	 * 修改
	 */
	public void update(Goods goods);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Goods findOne(Long id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbGoods goods, int pageNum, int pageSize);

	//批量审核
    public void updateStatus(Long[] ids,String status);
	//商品上下架
    public void updateIsMarketable(Long id,String isMarketable);
    /**
    * @Desc: 根据商品Id和审核状态查询It恩列表
    * @Param:  goodsId  status
    * @return: TbItem
    * @Date: 2018/12/2
    */
    public List<TbItem> findItemListByGoodsIdAndStatus(Long[] goodsIds,String status);

}
