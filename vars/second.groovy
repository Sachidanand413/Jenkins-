import groovy.transform.Field
@Field private First = null
def version_api_modulebuild=           "src"
def version_api_api_deployment=        "src"
def version_api_api_deployment_request="src"
def init(first) {
    First = first
}

def test1(){
        //add code for this method
        First.test2()
        echo "This is from second groovy and test-1 method"
        }
def updateEugeneModuleBuild(env,moduleBuildId,body,version_api_modulebuild){
    stage("test"){
        echo "Here iam $env---$moduleBuildId---$body----$version_api_modulebuild"
        //def var = load ("/vars/constants.groovy")
        First.api("constants.HOST","constants.AUTH_TOKEN","constants.moduleBuildId","constants.environment")
        echo "This is from second groovy and test-2 method"
        } 
    }
return this    

