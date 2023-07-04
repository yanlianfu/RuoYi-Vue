package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 页面配置对象 item_schemas
 * 
 * @author ruoyi
 * @date 2023-07-04
 */
public class ItemSchemas extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long schemaId;

    /** 页面名称 */
    @Excel(name = "页面名称")
    private String schemaName;

    /** 页面配置内容 */
    @Excel(name = "页面配置内容")
    private String schemaContext;

    public void setSchemaId(Long schemaId) 
    {
        this.schemaId = schemaId;
    }

    public Long getSchemaId() 
    {
        return schemaId;
    }
    public void setSchemaName(String schemaName) 
    {
        this.schemaName = schemaName;
    }

    public String getSchemaName() 
    {
        return schemaName;
    }
    public void setSchemaContext(String schemaContext) 
    {
        this.schemaContext = schemaContext;
    }

    public String getSchemaContext() 
    {
        return schemaContext;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("schemaId", getSchemaId())
            .append("schemaName", getSchemaName())
            .append("schemaContext", getSchemaContext())
            .toString();
    }
}
