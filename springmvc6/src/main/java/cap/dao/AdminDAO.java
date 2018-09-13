package cap.dao;

import cap.model.Admin;

public interface AdminDAO {
    public Admin login(Admin admin);
    List<Admin> findByPage(int pageNo,int pageSize);
    int getTotalCount();
}
