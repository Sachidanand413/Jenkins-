def build() {
        def var3 = load "../src/config.groovy"
        configParam = var3.config_params()
        sh """
        echo "from build function"
        """
}

def deploy(String arg2) {
        sh """
        echo "from deploy function : ${arg2}"
        """
}

return this
