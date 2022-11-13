def build() {
        def current_path =sh(script: "pwd", returnStdout: true).trim()
        GroovyShell shell = new GroovyShell()
        def params = shell.parse(new File("${current_path}/src/config.groovy"))
                configParams = params.config_params()
                ENVIRONMENT = configParams.ENVIRONMENT
                maven_file_id = configParams.maven_file_id
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
