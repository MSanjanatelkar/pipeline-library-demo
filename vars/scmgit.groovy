def call(String giturl) { 
		echo “cloning from GitHub”
		sh ‘git clone ${giturl}’
}

