import com.chenlun.mybatis.mapper.ParameterMapper;
import com.chenlun.mybatis.pojo.User;
import com.chenlun.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Try {
    public static void main(String[] args) throws IOException {
        SqlSession sqlSession=SqlSessionUtils.getSqlSession();
//        User user = mapper.getUserById();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
//        List<User> list =mapper.getAllUsers();
//        sqlSession.commit();
//        User user = mapper.getUserByUsername("admin");
//        User user =mapper.checkLogin("admin","123456");
        /*Map<String,Object> map = new HashMap<String,Object>();
        map.put("username","admin");
        map.put("password","123456");
        User user =mapper.checkLohinByMap(map);*/

/*        User user=new User(9,"chenlun","123456",22,"male","3202@qq.com");
        int i=mapper.insertUser(user);*/

        User user=mapper.checkLoginByParam("chenlun","123456");
        System.out.println(user);
//        list.forEach(User-> System.out.println(User));
    }
}
