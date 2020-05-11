'use strict';

import express from 'express';
import routes from './REST/routes'

const app = express();


app.use(express.static('public'));

routes(app);
app.listen(process.env.PORT || 3000, function () {
  console.info('Server is running')
});
