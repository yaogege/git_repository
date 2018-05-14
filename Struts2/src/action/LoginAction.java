package action;

import javax.swing.plaf.synth.SynthSeparatorUI;

import com.opensymphony.xwork2.ActionSupport;

import model.UserInfo;

public class LoginAction {

	private UserInfo userinfo;

	public UserInfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}

	/**
	 * 在这里返回值使用自定义的
	 * 
	 * @return
	 */
	public String execute() throws Exception {
		System.out.println("#############################");
		System.out.println("********:"+userinfo.getUsername());
		System.out.println("&&&&&&&&&&:"+userinfo.getPassword());

		// 会自动取出页面表单中的值
		if ("admin".equals(userinfo.getUsername()) && "123456".equals(userinfo.getPassword())) {
			System.out.println("登录成功");
			return "success";
		}
		return "error";
	}

}
