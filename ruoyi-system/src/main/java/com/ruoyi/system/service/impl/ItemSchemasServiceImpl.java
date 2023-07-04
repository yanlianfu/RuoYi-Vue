package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ItemSchemasMapper;
import com.ruoyi.system.domain.ItemSchemas;
import com.ruoyi.system.service.IItemSchemasService;

/**
 * 页面配置Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-07-04
 */
@Service
public class ItemSchemasServiceImpl implements IItemSchemasService 
{
    @Autowired
    private ItemSchemasMapper itemSchemasMapper;

    /**
     * 查询页面配置
     * 
     * @param schemaId 页面配置主键
     * @return 页面配置
     */
    @Override
    public ItemSchemas selectItemSchemasBySchemaId(Long schemaId)
    {
        return itemSchemasMapper.selectItemSchemasBySchemaId(schemaId);
    }

    /**
     * 查询页面配置列表
     * 
     * @param itemSchemas 页面配置
     * @return 页面配置
     */
    @Override
    public List<ItemSchemas> selectItemSchemasList(ItemSchemas itemSchemas)
    {
        return itemSchemasMapper.selectItemSchemasList(itemSchemas);
    }

    /**
     * 新增页面配置
     * 
     * @param itemSchemas 页面配置
     * @return 结果
     */
    @Override
    public int insertItemSchemas(ItemSchemas itemSchemas)
    {
        return itemSchemasMapper.insertItemSchemas(itemSchemas);
    }

    /**
     * 修改页面配置
     * 
     * @param itemSchemas 页面配置
     * @return 结果
     */
    @Override
    public int updateItemSchemas(ItemSchemas itemSchemas)
    {
        return itemSchemasMapper.updateItemSchemas(itemSchemas);
    }

    /**
     * 批量删除页面配置
     * 
     * @param schemaIds 需要删除的页面配置主键
     * @return 结果
     */
    @Override
    public int deleteItemSchemasBySchemaIds(Long[] schemaIds)
    {
        return itemSchemasMapper.deleteItemSchemasBySchemaIds(schemaIds);
    }

    /**
     * 删除页面配置信息
     * 
     * @param schemaId 页面配置主键
     * @return 结果
     */
    @Override
    public int deleteItemSchemasBySchemaId(Long schemaId)
    {
        return itemSchemasMapper.deleteItemSchemasBySchemaId(schemaId);
    }
}
