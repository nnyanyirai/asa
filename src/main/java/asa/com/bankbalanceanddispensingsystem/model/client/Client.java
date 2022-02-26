package asa.com.bankbalanceanddispensingsystem.model.client;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CLIENT")
public class Client {
  @Id
  @Column(name = "CLIENT_ID")
  private Integer clientId;

  @Column(name = "TITLE")
  private String title;

  @Column(name = "NAME")
  private String name;

  @Column(name = "SURNAME")
  private String surname;

  @Column(name = "DOB")
  private java.sql.Date dob;

  @Column(name = "CLIENT_SUB_TYPE_CODE")
  private String clientSubTypeCode;

//  @ManyToOne
//  private ClientSubType clientSubType;

}
