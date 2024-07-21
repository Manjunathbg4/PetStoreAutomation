package api.endpoints;

/* Create user(Post)--->https://petstore.swagger.io/v2/user
 * Get user (Get)------>https://petstore.swagger.io/v2/user/{usernmae}
 * Update user(put)---->https://petstore.swagger.io/v2/user/{usernmae}
 * Delete user(Delete)-->https://petstore.swagger.io/v2/user/{usernmae}
 * 
 */
public class Routes 
{
	public static String base_url="https://petstore.swagger.io/v2";
	
	//User Module
	
	public static String post_url=base_url+"/user";
	public static String get_url=base_url+"/user/{username}";
	public static String update_url=base_url+"/user/{username}";
	public static String delete_url=base_url+"/user/{username}";
	
	//Store model
	
	//Here you will create store module URL's

}
