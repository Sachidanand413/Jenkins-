import groovy.transform.Field
@Field private First = null
stage("test"){
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
        echo "Here iam $env---$moduleBuildId---$body----$version_api_modulebuild"
        First.api("$HOST","$AUTH_TOKEN","$moduleBuildId","$body")
        echo "This is from second groovy and test-2 method"
    }
    return this
}
