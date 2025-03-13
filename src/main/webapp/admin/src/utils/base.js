const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm2bn52/",
            name: "ssm2bn52",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm2bn52/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "固定资产管理系统"
        } 
    }
}
export default base
