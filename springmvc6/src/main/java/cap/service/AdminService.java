package cap.service;

import cap.model.Admin;
import cap.util.PageBean;

public interface AdminService {
    Admin login(Admin admin);

    PageBean findByPage(int pageNo, int pageSize);
    public Admin findAdmin(int id);
    public int update(int id,Admin admin);
    public int delete(int id);
    public int insert(Admin admin);
}
