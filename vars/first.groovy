def build() {
        stage("first Test")
                def var2 = load "src/config.groovy"
                var2.config_params()
                echo "from build function:"
                
}

def deploy(String arg2) {
        sh """
        echo "from deploy function : ${arg2}"
        """
}

return this
