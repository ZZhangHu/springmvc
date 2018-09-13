package cap.dao;

import cap.model.Admin;

import java.util.List;

public interface AdminDAO {
    Admin login(Admin admin);

    List<Admin> findByPage(int pageNo, int pageSize);
    public Admin findAdmin(Admin admin);
    public Admin findAdmin(int id);
    int getTotalCount();
    public int update(int id,Admin admin);
    public int delete(int id);
    public int insert(Admin admin);

}
