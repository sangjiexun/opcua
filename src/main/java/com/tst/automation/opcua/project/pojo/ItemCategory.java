package com.tst.automation.opcua.project.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tst.automation.opcua.core.pojo.OpcUaNamespace;
import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Data
@Table(name = "tbl_opc_ua_item_category")
public class ItemCategory {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;

    private Long opcUaNamespaceId;

    private String name;

    private String description;

    @Transient
    @JsonIgnore
    private OpcUaNamespace opcUaNamespace;
}
