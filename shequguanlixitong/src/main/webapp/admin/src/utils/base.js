const base = {
    get() {
        return {
            url : "http://localhost:8080/shequguanlixitong/",
            name: "shequguanlixitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/shequguanlixitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "社区管理系统"
        } 
    }
}
export default base
