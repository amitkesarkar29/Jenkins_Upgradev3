job('maven-build-dsl') {
    scm {
        github('https://github.com/amitkesarkar29/Jenkins_Upgradev3.git', 'master')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean package', 'maven-samples/single-module/pom.xml')
    }
    publishers {
        archiveArtifacts '**/*.war'     
    }
}
