package cn.iocoder.mall.system.biz.dto.oatuh2;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;

/**
 * 认证模块 - 访问令牌认证 DTO
 */
@Data
@Accessors(chain = true)
public class OAuth2AccessTokenAuthenticateDTO {

    @NotEmpty(message = "访问令牌不能为空")
    private String accessToken;
    @NotEmpty(message = "IP 不能为空")
    private String ip;

}
