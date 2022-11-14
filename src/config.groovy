
import groovy.transform.Field

def config_Params = {
         configParams = [          
                  "ENVIRONMENT" : "TEST",
                  "maven_file_id" : "21e8f8bc",
                  "maven_target_location" : "/home/jenkins/workspace/settings.xml",
                  "docker_login" : "docker login --username 00000000-0000-0000-0000-000000000000 --password ",
                  "sonar_scanner" : "sonar-scanner_3.2.0",
                  "dependency_check" : "dependency-check_6.5.1",
                  "api_modulebuild" : "api_v1/modulebuild",
                  "api_deployment" : "api_v1/deployment",
                  "api_deployment_request" : "api_v1/deploymentRequest",this
                  "go_tool" : "Go_1.19.2"
         ]
         return this
}
