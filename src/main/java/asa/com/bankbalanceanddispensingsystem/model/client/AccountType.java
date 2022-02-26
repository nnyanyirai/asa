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
@Table(name = "ACCOUNT_TYPE")
public class AccountType {
    @Id
    @Column(name = "ACCOUNT_TYPE_CODE")
    private String accountTypeCode;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "TRANSACTIONAL")
    private Boolean transactional;
}
