package cn.smallbun.screw.core.metadata.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author xieq
 * @date 2024/1/18 16:25
 */
@Data
public class IndexModel implements Serializable {

    private String tableName;

    private String indexName;

    private String columnName;
}
