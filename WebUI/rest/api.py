#!/usr/bin/python2

import web
import subprocess

urls = (
    '/solve', 'solve'
)

class solve:
    def GET(self):
        web.header('Access-Control-Allow-Origin', '*')
        p = subprocess.Popen("java -jar ./moap_rest_service.jar",
                            stdin=subprocess.PIPE,
                            stdout=subprocess.PIPE,
                            shell=True)

        d = web.input(_method="get")
        problem = d.problem

        p.stdin.write(problem+"\n")
        r = p.stdout.read()

        return r

app = web.application(urls, globals())
if __name__=="__main__":
    app.run()
