package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ItemSchemas;

/**
 * 页面配置Mapper接口
 * 
 * @author ruoyi
 * @date 2023-07-04
 */
public interface ItemSchemasMapper 
{
    /**
     * 查询页面配置
     * 
     * @param schemaId 页面配置主键
     * @return 页面配置
     */
    public ItemSchemas selectItemSchemasBySchemaId(Long schemaId);

    /**
     * 查询页面配置列表
     * 
     * @param itemSchemas 页面配置
     * @return 页面配置集合
     */
    public List<ItemSchemas> selectItemSchemasList(ItemSchemas itemSchemas);

    /**
     * 新增页面配置
     * 
     * @param itemSchemas 页面配置
     * @return 结果
     */
    public int insertItemSchemas(ItemSchemas itemSchemas);

    /**
     * 修改页面配置
     * 
     * @param itemSchemas 页面配置
     * @return 结果
     */
    public int updateItemSchemas(ItemSchemas itemSchemas);

    /**
     * 删除页面配置
     * 
     * @param schemaId 页面配置主键
     * @return 结果
     */
    public int deleteItemSchemasBySchemaId(Long schemaId);

    /**
     * 批量删除页面配置
     * 
     * @param schemaIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteItemSchemasBySchemaIds(Long[] schemaIds);
}
