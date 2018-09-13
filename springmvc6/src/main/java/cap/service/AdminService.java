package cap.service;

import cap.model.Admin;

public interface AdminService {
    public Admin login(Admin admin);
    PageBean findByPage(int pageNo, int pageSize);
}
