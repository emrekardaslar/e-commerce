export default {
   oidc: {
    clientId: 'YOUR_CLIENT_ID',
    issuer: 'DOMAIN_URL/oauth2/default',
    redirectUri: 'http://localhost:4200/login/callback',
    scopes: ['openid', 'profile', 'email'],
   }
}
