package k8s.deploy
import groovy.transform.Field

def config_params() {
    configParams = [          
         "ENVIRONMENT" : "TEST",
         "maven_file_id" : "21e8f8bc",
         "maven_target_location" : "/home/jenkins/workspace/settings.xml",
         "docker_login" : "docker login --username 00000000-0000-0000-0000-000000000000 --password ",
         "sonar_scanner" : "sonar-scanner_3.2.0",
         "dependency_check" : "dependency-check_6.5.1",
         "go_tool" : "Go_1.19.2"
    ]
    return configParams
}

return this
