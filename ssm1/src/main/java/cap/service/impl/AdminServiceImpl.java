//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cap.service.impl;

import cap.cap.service.AdminService;
import cap.mapper.AdminMapper;
import cap.model.Admin;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminMapper adminMapper;

    public AdminServiceImpl() {
    }

    public Admin selectById(Integer id) {
        return this.adminMapper.selectById(id);
    }

    public List<Admin> selectAll() {
        return this.adminMapper.selectAll();
    }

    public int addAdmin(Admin admin) {
        return this.adminMapper.addAdmin(admin);
    }

    public int updateAdmin(Admin admin) {
        return this.adminMapper.updateAdmin(admin);
    }

    public int deleteAdmin(Integer id) {
        return this.adminMapper.deleteAdmin(id);
    }
}
