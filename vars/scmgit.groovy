def call(String username, password, giturl) {
	  withCredentials([usernamePassword(
	        usernameVariable: ${username},
	        passwordVariable: ${password}
	    )])
          { 
		echo “cloning from GitHub”
		sh ‘git clone ${giturl}’
	 }
}

