def build() {
        sh """
        echo "from build function:"
        """
}

def deploy(String arg2) {
        sh """
        echo "from deploy function : ${arg2}"
        """
}

return this
