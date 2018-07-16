package hust.plane.service.interFace;

import hust.plane.mapper.pojo.User;
import hust.plane.utils.page.Page;
import hust.plane.utils.page.TailPage;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

public interface UserService {
    User login(String username, String password);

    int register(String username, String password);

    User queryUserById(String uid);

    void modifyPwd(HttpServletRequest request, String oldpassword, String password);

	List<User> findByUserRole(User userExmple);

    TailPage<User> getAllUserWithPage(TailPage<User> page);
}
