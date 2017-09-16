package com.mmb.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 * Created by hubin on 2017/9/15.
 */
@Data
public class User  {

    private String id;

    private String username;

    private String password;

    private String email;

    private List<Role> roles;


}
