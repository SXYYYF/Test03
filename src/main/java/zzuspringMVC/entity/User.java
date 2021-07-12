package zzuspringMVC.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author ASUS
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
     private int id;
     private String username;
     private String password;
}
