import com.chenlun.mybatis.mapper.SelectMapper;
import com.chenlun.mybatis.pojo.User;
import com.chenlun.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import javax.annotation.Resource;
import javax.annotation.Resources;

public class Try1 {
    public static void main(String[] args) {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUserById(9));
        System.out.println(mapper.getAllUsers());
        System.out.println(mapper.getCount());
        System.out.println(mapper.getUserByIdToMap(9));
        System.out.println(mapper.getAllUsersToMap());
    }
}
