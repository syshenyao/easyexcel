package com.alibaba.excel.write.handler.context;

import com.alibaba.excel.context.WriteContext;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * workbook context
 *
 * @author Jiaju Zhuang
 */
@Data
@AllArgsConstructor
public class WorkbookWriteHandlerContext {
    /**
     * write context
     */
    private WriteContext writeContext;
    /**
     * workbook
     */
    private WriteWorkbookHolder writeWorkbookHolder;
}
