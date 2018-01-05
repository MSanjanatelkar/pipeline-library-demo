def call(String giturl) { 
		echo “cloning from GitHub”
		sh 'cd /Users/sanjana.t/' 
		sh ‘git clone ${giturl}’
}

