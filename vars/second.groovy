import groovy.transform.Field
@Field private First = null

def init(first) {
    First = first
}
def test1(){
    //add code for this method
    echo "This is from second groovy and test-1 method"
}
def test2(){
    First.test2()
    echo "This is from second groovy and test-2 method"
}
return this
