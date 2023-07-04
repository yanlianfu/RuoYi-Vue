package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.ItemSchemas;
import com.ruoyi.system.service.IItemSchemasService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 页面配置Controller
 * 
 * @author ruoyi
 * @date 2023-07-04
 */
@RestController
@CrossOrigin
@RequestMapping("/system/schemas")
public class ItemSchemasController extends BaseController
{
    @Autowired
    private IItemSchemasService itemSchemasService;

    /**
     * 查询页面配置列表
     */
    @PreAuthorize("@ss.hasPermi('system:schemas:list')")
    @GetMapping("/list")
    public TableDataInfo list(ItemSchemas itemSchemas)
    {
        startPage();
        List<ItemSchemas> list = itemSchemasService.selectItemSchemasList(itemSchemas);
        return getDataTable(list);
    }

    /**
     * 导出页面配置列表
     */
    @PreAuthorize("@ss.hasPermi('system:schemas:export')")
    @Log(title = "页面配置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ItemSchemas itemSchemas)
    {
        List<ItemSchemas> list = itemSchemasService.selectItemSchemasList(itemSchemas);
        ExcelUtil<ItemSchemas> util = new ExcelUtil<ItemSchemas>(ItemSchemas.class);
        util.exportExcel(response, list, "页面配置数据");
    }

    /**
     * 获取页面配置详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:schemas:query')")
    @GetMapping(value = "/{schemaId}")
    public AjaxResult getInfo(@PathVariable("schemaId") Long schemaId)
    {
        return success(itemSchemasService.selectItemSchemasBySchemaId(schemaId));
    }

    /**
     * 新增页面配置
     */
    @PreAuthorize("@ss.hasPermi('system:schemas:add')")
    @Log(title = "页面配置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ItemSchemas itemSchemas)
    {
        return toAjax(itemSchemasService.insertItemSchemas(itemSchemas));
    }

    /**
     * 修改页面配置
     */
    @PreAuthorize("@ss.hasPermi('system:schemas:edit')")
    @Log(title = "页面配置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ItemSchemas itemSchemas)
    {
        return toAjax(itemSchemasService.updateItemSchemas(itemSchemas));
    }

    /**
     * 删除页面配置
     */
    @PreAuthorize("@ss.hasPermi('system:schemas:remove')")
    @Log(title = "页面配置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{schemaIds}")
    public AjaxResult remove(@PathVariable Long[] schemaIds)
    {
        return toAjax(itemSchemasService.deleteItemSchemasBySchemaIds(schemaIds));
    }
}
