package priv.huke.mapper;

import org.springframework.stereotype.Repository;
import priv.huke.vo.User;

@Repository
public interface UserMapper {
    User Sel(int id);
}
