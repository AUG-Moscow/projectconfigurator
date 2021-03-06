/* (C)2020 */
package ru.mail.jira.plugins.projectconfigurator.rest.dto;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("UnusedDeclaration")
@XmlRootElement
@Getter
@Setter
public class ItemDto {

  @XmlElement String id;
  @XmlElement String name;
  @XmlElement List<ItemDto> children;

  public ItemDto(String id, String name) {
    this.id = id;
    this.name = name;
  }
}
