//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cap.cap.service;

import cap.model.Admin;
import java.util.List;

public interface AdminService {
    Admin selectById(Integer var1);

    List<Admin> selectAll();

    int addAdmin(Admin var1);

    int updateAdmin(Admin var1);

    int deleteAdmin(Integer var1);
}
