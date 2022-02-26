package asa.com.bankbalanceanddispensingsystem.model.client;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CLIENT_SUB_TYPE")
public class ClientSubType {
    @Id
    @Column(name = "CLIENT_SUB_TYPE_CODE")
    private String clientSubTypeCode;

    @Column(name = "CLIENT_TYPE_CODE")
    private String clientTypeCode;

    @Column(name = "DESCRIPTION")
    private String description;

    @ManyToOne
    private ClientType clientType;
}
