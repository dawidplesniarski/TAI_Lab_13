const config = {
  // databaseUrl: 'mongodb://tai:taitai1@ds147180.mlab.com:47180/tai',
  databaseUrl: 'mongodb+srv://dawidplesniarski:12345@cluster0-c4nxf.mongodb.net/test?retryWrites=true&w=majority',
  JwtSecret: process.env.JWT_SERCRET || 'secret',
  port: 3000

}
export default config
